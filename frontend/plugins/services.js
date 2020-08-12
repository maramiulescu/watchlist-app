import ToWatchService from 'assets/service/ToWatchService'
import LoginService from 'assets/service/LoginService'

export default (ctx, inject) => {
  const services = {
    login: new LoginService(ctx.$axios),
    towatch: new ToWatchService(ctx.$axios)
  }

  inject('services', services)
}
