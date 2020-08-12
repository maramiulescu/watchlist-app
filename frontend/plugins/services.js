import ToWatchService from 'assets/service/ToWatchService'

export default (ctx, inject) => {
  const services = {
    towatch: new ToWatchService(ctx.$axios)
  }

  inject('services', services)
}
