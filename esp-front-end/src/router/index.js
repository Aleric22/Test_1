import Vue from 'vue'
import VueRouter from 'vue-router'

import login from '@/components/Login'
import Add from '@/components/Add'
import Delete from '@/components/Delete'
import Search from '@/components/Search'
import Update from '@/components/Update'

Vue.use(VueRouter)
import Vuex from 'vuex'
Vue.use(Vuex)
import store from '../store'

let router = new VueRouter({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'login',
      component: login,
      beforeEnter: (to, from, next) => {
        if(store.getters.isLoggedIn){
          next('Login')
        }else{
          next()
        }
      }
    },
    {
      path: '/Add',
      name: 'Add',
      component: Add,
      meta: {
        requiresAuth: true,
        allowAuth: 'Add'
      },
    },
    {
      path: '/Delete',
      name: 'Delete',
      component: Delete,
      meta: {
        requiresAuth: true,
        allowAuth: 'Delete'

      }
    },
    {
      path: '/Search',
      name: 'Search',
      component: Search,
      meta: {
        requiresAuth: true,
        allowAuth: 'Search'

      }
    },
    {
      path: '/Update',
      name: 'Update',
      component: Update,
      meta: {
        requiresAuth: true,
        allowAuth: 'Update'

      }
    },
  ]
})




router.beforeEach((to, from, next) => {
  if (to.matched.some(record => record.meta.requiresAuth)) {
    if (store.getters.isLoggedIn) {

      if (to.matched.some(record => record.meta.allowAuth)) {


        if (store.getters.authToken == to.meta.allowAuth) {
          next()
          return
        } else {
          next('/')
        }
      }

    } else {
      next('/')
    }

  } else {
    next()
  }
})

export default router

