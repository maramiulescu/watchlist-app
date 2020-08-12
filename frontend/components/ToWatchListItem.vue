<template>
  <div class="to-watch-item" :class="{ watched: towatch.watched, liked: towatch.liked }">
    <span>{{ towatch.title }}</span>
    <div class="controls">
      <span @click="deleteItem">🗑</span>
      <span @click="watchItem">✓</span>
      <span @click="likeItem">❤</span>
    </div>
  </div>
</template>

<script>

export default {
  props: {
    towatch: {
      type: Object,
      default () {
        return {}
      }
    }
  },
  methods: {
    watchItem () {
      this.$services.towatch.watch(this.towatch).then((data) => {
        if (this.towatch.watched) {
          this.towatch.watched = false
        } else {
          this.towatch.watched = true
        }
      })
    },
    likeItem () {
      this.$services.towatch.like(this.towatch).then((data) => {
        if (this.towatch.liked) {
          this.towatch.liked = false
        } else {
          this.towatch.liked = true
        }
      })
    },
    deleteItem () {
      this.$services.towatch.deleteItem(this.towatch.id).then(() => {
        this.$emit('delete', this.towatch)
      })
    }
  }
}
</script>

<style lang="scss">
.to-watch-item {
  width: 100%;
  display: block;
  height: 50px;
  &.watched {
    opacity: 0.5;
  }
  &.liked {
    color: darkred;
  }
  span {
    height: 50px;
    padding-left: 20px;
    line-height: 50px;
    width: 300px;
    display: inline-block;
  }
  .controls {
    display: inline-block;
    height: 50px;
    line-height: 50px;
    span {
      line-height: 50px;
      height: 50px;
      display: inline-block;
      width: 45px;
      text-align: center;
      padding: 0;
      cursor: pointer;
    }
  }
}
</style>
