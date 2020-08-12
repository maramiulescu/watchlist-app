<template>
  <div class="to-watch-container">
    <to-watch-item-create @create="createItem" />
    <div class="to-watch-list-container">
      <to-watch-list-item v-for="towatch in towatchs" :key="towatch.id" :towatch="towatch" @delete="deleteItem" />
    </div>
  </div>
</template>

<script>
import ToWatchItemCreate from '~/components/ToWatchItemCreate.vue'
import ToWatchListItem from '~/components/ToWatchListItem.vue'

export default {
  components: {
    ToWatchItemCreate,
    ToWatchListItem
  },
  props: {
    towatchs: {
      type: Array,
      default () {
        return []
      }
    }
  },
  data () {
    return {
      titleOfNewToWatch: ''
    }
  },
  methods: {
    createItem (item) {
      this.towatchs.push(item)
    },
    deleteItem (item) {
      this.towatchs.splice(this.towatchs.indexOf(item), 1)
    }
  }
}
</script>

<style lang="scss">
.to-watch-container {
  width: 700px;
  height: fit-content;
  margin: auto;
  margin-top: 50px;
  display: block;

  .create-container {
    width: 100%;
    height: fit-content;
    box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.1);

    input {
      height: 30px;
      width: 85%;
      border: none;
      padding-left: 30px;
      padding-bottom: 20px;
      padding-top: 20px;
      font-family: "Quicksand", "Source Sans Pro", -apple-system,
      BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial,
      sans-serif;
      font-size: 18px;
      &:focus {
        outline: none;
      }
    }

    button {
      height: 30px;
      width: 75px;
      border: none;
      cursor: pointer;
      text-align: center;
      font-size: 18px;
      background-color: white;
      &:focus {
        outline: #47494e;
      }
    }
    button:hover {
      ;
    }
  }
}
.to-watch-list-container {
  width: 700px;
  height: fit-content;
  padding-top: 10px;
  padding-bottom: 10px;
  margin: auto;
  margin-top: 30px;
  display: block;
  box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.1);
}
</style>
