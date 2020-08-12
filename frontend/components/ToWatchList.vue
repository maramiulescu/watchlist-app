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
  width: 400px;
  margin: auto;
  margin-top: 50px;
  display: block;

  .create-container {
    width: 100%;
    height: 50px;
    box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.1);

    input {
      height: 50px;
      width: 250px;
      border: none;
      padding-left: 10px;
      font-family: "Quicksand", "Source Sans Pro", -apple-system,
      BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial,
      sans-serif;
      font-size: 18px;
      &:focus {
        outline: none;
      }
    }

    button {
      height: 45px;
      width: 145px;
      border: none;
      cursor: pointer;
      text-align: right;
      padding-right: 20px;
      font-size: 18px;
      &:focus {
        outline: none;
      }
    }
  }
}
.to-watch-list-container {
  width: 400px;
  margin: auto;
  margin-top: 50px;
  display: block;
  box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.1);
}
</style>
