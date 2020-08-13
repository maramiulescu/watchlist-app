<template>
  <div class="container">
    <h1 class="title">
      Watchlist
    </h1>
    <form action="post" @submit.prevent="performLogin">
      <p>
        <input
          id="username"
          v-model="username"
          type="text"
          name="username"
          placeholder="user"
          required
          autofocus
        >
      </p>
      <p>
        <input
          id="password"
          v-model="password"
          type="password"
          name="password"
          placeholder="password"
          required
        >
      </p>
      <button type="submit">
        <font-awesome-icon icon="plus" size="xs" />
      </button>
    </form>
  </div>
</template>
<script>

export default {
  data () {
    return {
      username: '',
      password: ''
    }
  },
  methods: {
    async performLogin () {
      if (await this.$services.login.performLogin(this.username, this.password)) {
        this.$router.push('towatch')
      } else {
        this.username = ''
        this.password = ''
      }
    }
  }
}
</script>
<style>

form {
  width: 200px;
  margin: auto;
  margin-top: 70px;
  text-align: center;
}

input {
  width: 100%;
  border: none;
  border-bottom: 1px black solid;
  background: none;
  height: 50px;
  line-height: 50px;
  font-size: 17px;
  font-family: monospace;
  font-weight: 300;
  margin-top: 20px;
  margin-bottom: 20px;
  outline: none;
}

button {
  width: 40%;
  height: 50px;
  border: none;
  font-family: monospace;
  font-size: 18px;
  font-weight: 600;
  cursor: pointer;
  outline: none;
  margin-top: 20px;
  border-radius: 20px;
  box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.1);
}
button:hover {
  color: cornflowerblue;
}
</style>
