<template>
  <div class="container">
    <h1 class="title">
      Watchlist
    </h1>
    <to-watch-list :towatchs="towatchs" />
  </div>
</template>

<script>
import ToWatchList from '~/components/ToWatchList.vue'
export default {
  components: {
    ToWatchList
  },
  async asyncData (ctx) {
    return {
      towatchs: await ctx.app.$services.towatch.findAll()
    }
  },
  data () {
    return {
      towatchs: {
        type: Array
      }
    }
  }
}
</script>
