<template>
  <div class="container-fluid" style="height:90%">
    <form v-on:submit.prevent="submit_form" style="width:100%;height:100%">
      <p>
        <br />
      </p>

      <div class="d-flex justify-content-center form-row form-group">
        <div class="col-md-2">
          <label>產品名稱</label>
        </div>
        <div class="col-md-1">
          <label>{{transferForm.Product_Name}}</label>
        </div>
      </div>

      <div class="d-flex justify-content-center form-row form-group">
        <div class="col-md-2">
          <label>扣款帳號</label>
        </div>
        <div class="col-md-1">
          <label>{{transferForm.Account}}</label>
        </div>
      </div>

      <div class="d-flex justify-content-center form-row form-group">
        <div class="col-md-2">
          <label>扣款金額</label>
        </div>
        <div class="col-md-1">
          <label>{{transferForm.Total_Amount}}</label>
        </div>
      </div>

      <div class="d-flex justify-content-center form-row form-group">
        <div class="col-md-2">
          <label>手續費用</label>
        </div>
        <div class="col-md-1">
          <label>{{transferForm.Total_Fee}}</label>
        </div>
      </div>

      <div class="d-flex justify-content-center form-row form-group">
        <div class="col-md-2">
          <label>電子信箱</label>
        </div>
        <div class="col-md-1">
          <label>{{transferForm.Email}}</label>
        </div>
      </div>

      <div class="d-flex justify-content-center form-row">
        <div class="col-4"></div>
        <div class="d-flex align-items-end flex-column col-2">
          <button type="submit" class="btn btn-primary">確認</button>
        </div>
      </div>

    </form>
  </div>
</template>


<script>
export default {
  data() {
    return {
      transactType: "查詢喜好金融商品",
      transferForm: {
        Product_Name: "",
        Account: "0",
        Total_Amount: "",
        Total_Fee: "",
        Email: "",
      }
    };
  },
  methods: {
    submit_form() {
      if (confirm("您確定要送出嗎？")) {
        let uri = "api/POST/transaction";
        this.axios
          .post(uri, {
            type: this.transactType,
            receiptsData: JSON.stringify(this.transferForm),
            branchCode: this.$store.getters.getBranchCode
          })
          .then(response => {
            this.axios
              .get("api/GET/transaction/" + response.data.id)
              .then(res => {
                alert(
                  "已送出申請，即將返回首頁，您的交易編號為：" + res.data.tnum
                );
              });
          });

        this.$router.push("Login");
      } else {
        console.log("取消");
      }
    },
    get_child_data(value) {
      this.transferForm.customerAccount = value.customerAccount;
    }
  },
};
</script>
