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
  margin-top: 100px;
  display: block;

  .create-container {
    width: 100%;
    height: 70px;
    border-radius: 20px;
    text-align: center;

    input {
      height: 30px;
      width: 75%;
      border: none;
      border-bottom: 1px black solid;
      padding-left: 30px;
      padding-bottom: 20px;
      padding-right: 20px;
      padding-top: 20px;
      text-underline: lightgray;
      font-family: monospace;
      font-size: 17px;
      color: #4a4a4a;
      &:focus {
        outline: none;
      }
    }

    button {
      height: 40px;
      width: 75px;
      border: none;
      cursor: pointer;
      text-align: center;
      font-size: 18px;
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
  //margin: auto;
  margin-top: 20px;
  display: block;
  //box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.1);
}
</style>
