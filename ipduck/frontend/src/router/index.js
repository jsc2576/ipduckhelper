import Vue from 'vue'
import Router from 'vue-router'
import Srch from '@/components/Srch'
import Login from '@/components/Login'
import Signup from '@/components/Signup'
import SignupDone from '@/components/SignupDone'
import SrchDtl from '@/components/SrchDtl'
import SrchRstList from '@/components/SrchRstList'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    // { path: '*', redirect: '/' },
    { path: '/', name: 'Main', redirect: '/srch/view' },
    { path: '/srch/view', name: 'Srch', component: Srch },
    { path: '/login/view', name: 'Login', component: Login },
    { path: '/signup/view', name: 'Signup', component: Signup },
    { path: '/signup/doen/view', name: 'SignupDone', component: SignupDone },
    { path: '/srch/dtl', name: 'SrchDtl', component: SrchDtl },
    { path: '/srch/rst/list/view', name: 'SrchRstList', component: SrchRstList }
  ]
})
