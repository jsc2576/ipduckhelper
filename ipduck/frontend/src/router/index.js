import Vue from 'vue'
import Router from 'vue-router'
import StarSrch from '@/components/StarSrch'
import Login from '@/components/Login'
import Signup from '@/components/Signup'
import SignupDone from '@/components/SignupDone'
import StarSrchDtl from '@/components/StarSrchDtl'
import StarSrchRstList from '@/components/StarSrchRstList'
import StarSrchRstDtl from '@/components/StarSrchRstDtl'
import StarCrt from '@/components/StarCrt'
import PostListNo from '@/components/PostListNo'
import PostDtlNo from '@/components/PostDtlNo'
import PostWrtNo from '@/components/PostWrtNo'
import MyInfo from '@/components/MyInfo'
import MyMfy from '@/components/MyMfy'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    // { path: '*', redirect: '/' },
    { path: '/', name: 'Main', redirect: '/star/srch/view' },
    { path: '/star/srch/view', name: 'StarSrch', component: StarSrch },
    { path: '/login/view', name: 'Login', component: Login },
    { path: '/signup/view', name: 'Signup', component: Signup },
    { path: '/signup/done/view', name: 'SignupDone', component: SignupDone },
    { path: '/star/srch/dtl/view', name: 'StarSrchDtl', component: StarSrchDtl },
    { path: '/star/srch/rst/list/view', name: 'StarSrchRstList', component: StarSrchRstList },
    { path: '/star/srch/rst/dtl/view', name: 'StarSrchRstDtl', component: StarSrchRstDtl },
    { path: '/post/list/view/:no', name: 'PostListNo', component: PostListNo },
    { path: '/post/dtl/view/:no1/:no2', name: 'PostDtlNo', component: PostDtlNo },
    { path: '/post/write/view/:no', name: 'PostWrtNo', component: PostWrtNo },
    { path: '/star/crt/view', name: 'StarCrt', component: StarCrt },
    { path: '/my/info/view', name: 'MyInfo', component: MyInfo },
    { path: '/my/mfy/view', name: 'MyMfy', component: MyMfy }
  ]
})
