<template>
  <div class="container">
    <h1 class="title">
      My Watchlist
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
  asyncData (ctx) {
    return {
      towatchs: [
        {
          id: '1',
          title: 'A',
          watched: false,
          liked: false
        },
        {
          id: '2',
          title: 'B',
          watched: true,
          liked: true
        }
      ]
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
