<template>
  <div class="create-container">
    <input v-model="titleOfNewToWatch" type="text">
    <button @click="create">
      Add
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
      this.$emit('create', { id: this.titleOfNewToWatch, title: this.titleOfNewToWatch, watched: false, liked: false })
      this.titleOfNewToWatch = ''
    }
  }
}
</script>
