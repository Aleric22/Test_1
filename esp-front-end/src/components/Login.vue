<template>
  <!-- Button -->
  <div class="container-fluid" style="height:90%">
    <div class="row justify-content-center" style="height:20%;"></div>
    <div class="row justify-content-center" style="height:40%;">
      <div class="col-3">
        <form v-on:submit.prevent="goto_deposit" style="width:100%;height:100%;">
          <button
            type="submit"
            class="btn btn-info text-light;"
            style="width:100%;height:100%;font-size:xx-large;"
          >新增</button>
        </form>
      </div>
      <div class="col-3">
        <form v-on:submit.prevent="goto_withdraw" style="width:100%;height:100%">
          <button
            type="submit"
            class="btn btn-info text-light;"
            style="width:100%;height:100%;font-size:xx-large;"
          >查詢</button>
        </form>
      </div>
      <div class="col-3">
        <form v-on:submit.prevent="goto_transfer" style="width:100%;height:100%">
          <button
            type="submit"
            class="btn btn-info text-light;"
            style="width:100%;height:100%;font-size:xx-large;"
          >刪除</button>
        </form>
      </div>
      <div class="col-3">
        <form v-on:submit.prevent="goto_transfer" style="width:100%;height:100%">
          <button
            type="submit"
            class="btn btn-info text-light;"
            style="width:100%;height:100%;font-size:xx-large;"
          >更改</button>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    goto_add() {
      this.$router.push({ name: "Add" });
    },
    goto_search() {
      this.$router.push({ name: "Search" });
    },
    goto_delete() {
      this.$router.push({ name: "Delete" });
    },
    goto_update() {
      this.$router.push({ name: "Update" });
    }
  }
};
</script>
<style>
.btn-info{
  background-color:#00AD95;
}
</style>

