<template>
  <div class="create-container">
    <input v-model="titleOfNewToWatch" type="text" @keyup.enter="create">
    <button @click="create">
      <font-awesome-icon icon="plus" />
      <!--      <span class="add-text">add</span>-->
    </button>
  </div>
</template>

<script>

export default {
  data () {
    return {
      titleOfNewToWatch: ''
    }
  },
  methods: {
    create () {
      this.$services.towatch.create(this.titleOfNewToWatch).then((data) => {
        this.$emit('create', data)
        this.titleOfNewToWatch = ''
      })
    }
  }
}
</script>

<style lang="scss">
.create-container {
  button {
    color: lightgray;
    //.add-text {
    //  visibility: visible;
    //  font-size: smaller;
    //  width: 120px;
    //  bottom: 100%;
    //  left: 50%;
    //  margin-left: -60px;
    //}
  }
  button:hover {
    color: cornflowerblue;
  }
  //button:hover .add-text {
  //  visibility: visible;
  //}
}
</style>
