<template>
  <div class="container-fluid" style="height:90%">
    <form v-on:submit.prevent="submit_form" style="width:100%;height:100%">
      <p>
        <br />
      </p>

      <div class="d-flex justify-content-center form-row form-group">
        <div class="col-md-2">
          <label for="Product_Name">產品名稱</label>
        </div>
        <div class="col-md-4">
          <input
            autocomplete="off"
            type="text"
            class="form-control"
            id="Product_Name"
            placeholder="請輸入名稱"
            @input="transferFeeCounter()"
            v-model="transferForm.Product_Name"
            required
          />
        </div>
      </div>

      <div class="d-flex justify-content-center form-row form-group">
        <div class="col-md-2">
          <label for="Price">產品價格</label>
        </div>
        <div class="col-md-4">
          <input
            autocomplete="off"
            type="text"
            class="form-control"
            id="Price"
            placeholder="請輸入價格"
            v-model="transferForm.Price"
            required
          />
        </div>
      </div>

      <div class="d-flex justify-content-center form-row form-group">
        <div class="col-md-2">
          <label for="Fee_Rate">產品手續費</label>
        </div>
        <div class="col-md-4">
          <input
            autocomplete="off"
            type="text"
            class="form-control"
            id="Fee_Rate"
            placeholder="請輸入手續費"
            v-model="transferForm.Fee_Rate"
            required
          />
        </div>
      </div>

      <div class="d-flex justify-content-center form-row form-group">
        <div class="col-md-2">
          <label for="Account">扣款帳號</label>
        </div>
        <div class="col-md-4">
          <input
            autocomplete="off"
            type="text"
            class="form-control"
            id="Account"
            placeholder="請輸入扣款帳號"
            v-model="transferForm.Account"
            required
          />
        </div>
      </div>

      <div class="d-flex justify-content-center form-row form-group">
        <div class="col-md-2">
          <label for="Order_Name">購買數量</label>
        </div>
        <div class="col-md-4">
          <input
            autocomplete="off"
            type="text"
            class="form-control"
            id="Order_Name"
            placeholder="請輸入購買數量"
            v-model="transferForm.Order_Name"
            required
          />
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
      transactType: "更改喜好金融商品",
      transferForm: {
        Product_Name: "",
        Price: "0",
        Fee_Rate: "",
        Account: "",
        Order_Name: "",
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
