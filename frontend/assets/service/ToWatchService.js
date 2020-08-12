import ToWatch from '~/assets/data/ToWatch.class'

export default class ToWatchApi {
  constructor ($axios) {
    this.axios = $axios
  }

  findAll () {
    return this.axios({
      method: 'get',
      url: 'towatch',
      withCredentials: true
    }).then((response) => {
      const towatchs = []
      response.data.forEach((towatch) => {
        towatchs.push(new ToWatch(towatch.id, towatch.title, towatch.watched, towatch.liked))
      })
      return towatchs
    })
  }

  create (title) {
    return this.axios({
      method: 'post',
      url: 'towatch',
      data: {
        title,
        watched: false,
        liked: false
      },
      withCredentials: true
    }).then((response) => {
      return response.data
    })
  }

  watch (towatch) {
    return this.axios({
      method: 'put',
      url: 'towatch/' + towatch.id,
      data: {
        id: towatch.id,
        title: towatch.title,
        watched: true,
        liked: towatch.liked
      }
    })
  }

  like (towatch) {
    return this.axios({
      method: 'put',
      url: 'towatch/' + towatch.id,
      data: {
        id: towatch.id,
        title: towatch.title,
        watched: towatch.watched,
        liked: true
      }
    })
  }

  deleteItem (id) {
    return this.axios({
      method: 'delete',
      url: 'towatch/' + id,
      withCredentials: true
    })
  }
}
