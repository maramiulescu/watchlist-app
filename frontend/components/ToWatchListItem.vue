<template>
  <div class="to-watch-item" :class="{ watched: towatch.watched, liked: towatch.liked }">
    <span>{{ towatch.title }}</span>
    <div class="controls">
      <div class="watch">
        <span @click="watchItem"><font-awesome-icon icon="check" /></span>
      </div>
      <div class="like">
        <span @click="likeItem"><font-awesome-icon icon="heart" /></span>
      </div>
      <div class="delete">
        <span @click="deleteItem"><font-awesome-icon icon="trash" /></span>
      </div>
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
        this.towatch.watched = !this.towatch.watched
      })
    },
    likeItem () {
      this.$services.towatch.like(this.towatch).then((data) => {
        this.towatch.liked = !this.towatch.liked
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
  height: fit-content;
  &.watched .controls .watch {
    color: cadetblue;
  }
  &.liked .controls .like {
    color: lightcoral;
  }
  span {
    height: 50px;
    padding-left: 30px;
    line-height: 50px;
    width: 75%;
    display: inline-block;
    overflow-wrap: break-word;
  }
  .controls {
    display: inline-flex;
    height: fit-content;
    width: fit-content;
    color: lightgray;
    cursor: pointer;
    line-height: 50px;
    .watch:hover {
      color: cadetblue;
    }
    .like:hover {
      color: lightcoral;
    }
    .delete:hover {
      color: cornflowerblue;
    }
  }
}
</style>
