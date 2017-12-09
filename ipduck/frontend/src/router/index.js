import Vue from 'vue'
import Router from 'vue-router'
import Srch from '@/components/Srch'
import Login from '@/components/Login'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    { path: '*', redirect: '/' },
    { path: '/', redirect: '/srch/view' },
    { path: '/srch/view', name: 'Srch', component: Srch },
    { path: '/login/view', name: 'Login', component: Login }
  ]
})
