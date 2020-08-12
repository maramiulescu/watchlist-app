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
      this.$services.towatch.create(this.titleOfNewToWatch).then((data) => {
        this.$emit('create', data)
        this.titleOfNewToWatch = ''
      })
    }
  }
}
</script>
