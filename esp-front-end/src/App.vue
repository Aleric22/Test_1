<template> 
<!-- class="imgcs" v-bind:style="{'background-image': 'url(' + require('../static/bgimg1.png') + ')'}" -->
  <div id="app" style="background-color:#EAEAEA">
    <!-- nav bar -->
    <nav class="navbar navbar-expand-lg navbar-light staticcor" style="height:10%">
      <button
        class="navbar-toggler"
        type="button"
        data-toggle="collapse"
        data-target="#navbarTogglerDemo01"
        aria-controls="navbarTogglerDemo01"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      
      <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
        <!-- <span class="navbar-brand text-light">喜好紀錄系統</span> -->
        <a class="navbar-brand text-light" href="/">金融商品喜好紀錄系統</a>

        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a v-if="isLoggedIn" class="nav-link" href="#" @click="login">Login</a>
          </li>
          <li class="nav-item">
            <a v-if="isLoggedIn" class="nav-link" href="#" @click="logout">Logout</a>
          </li>
        </ul>
      </div>
    </nav>
    <router-view />
    
  </div>
  
</template>

<script>
export default {
  data() {
    return {
      userInfo: ""
    }
  },
  computed: {
    isLoggedIn: function() {
      return this.$store.getters.isLoggedIn;
    }
  },
  methods: {
    login: function() {
      if (confirm("您要登入嗎？")) {
        this.$store.dispatch("login");
        this.$router.push("/");
      } else {
        console.log("取消");
      }
    },
  },
};
</script>
<style>
html,
body,
#app {
  height: 100%;
}
.imgcs{
  height: 100%;
  background-size: cover;
  background-position: absolute;
  background-attachment: fixed;
}
.staticcor {
  background-color: #00ad95
}
</style>
