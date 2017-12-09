import Vue from 'vue'
import Router from 'vue-router'
import Srch from '@/components/Srch'
import Login from '@/components/Login'
import Signup from '@/components/Signup'
import SignupDone from '@/components/SignupDone'
import SrchDtl from '@/components/SrchDtl'
import SrchRstList from '@/components/SrchRstList'
import SrchRstDtl from '@/components/SrchRstDtl'
import PostListNo from '@/components/PostListNo'
import PostDtlNo from '@/components/PostDtlNo'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    // { path: '*', redirect: '/' },
    { path: '/', name: 'Main', redirect: '/srch/view' },
    { path: '/srch/view', name: 'Srch', component: Srch },
    { path: '/login/view', name: 'Login', component: Login },
    { path: '/signup/view', name: 'Signup', component: Signup },
    { path: '/signup/done/view', name: 'SignupDone', component: SignupDone },
    { path: '/srch/dtl/view', name: 'SrchDtl', component: SrchDtl },
    { path: '/srch/rst/list/view', name: 'SrchRstList', component: SrchRstList },
    { path: '/srch/rst/dtl/view', name: 'SrchRstDtl', component: SrchRstDtl },
    { path: '/post/list/view/:no', name: 'PostListNo', component: PostListNo },
    { path: '/post/dtl/view/:no1/:no2', name: 'PostDtlNo', component: PostDtlNo }
  ]
})
