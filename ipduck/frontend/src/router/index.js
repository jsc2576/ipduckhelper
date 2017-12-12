import Vue from 'vue'
import Router from 'vue-router'
import StarSrch from '@/components/StarSrch'
import Login from '@/components/Login'
import Signup from '@/components/Signup'
import SignupDone from '@/components/SignupDone'
import StarSrchDtl from '@/components/StarSrchDtl'
import StarSrchRstList from '@/components/StarSrchRstList'
import StarSrchRst from '@/components/StarSrchRst'
import StarSrchRstDtl from '@/components/StarSrchRstDtl'
import StarCrt from '@/components/StarCrt'
import Cmpy from '@/components/Cmpy'
import PostListNo from '@/components/PostListNo'
import PostList from '@/components/PostList'
import PostDtlNo from '@/components/PostDtlNo'
import PostWrtNo from '@/components/PostWrtNo'
import MyInfo from '@/components/MyInfo'
import MyLikePost from '@/components/MyLikePost'
import MyLikeStar from '@/components/MyLikeStar'
import MyPostList from '@/components/MyPostList'
import MyMfy from '@/components/MyMfy'
import MmList from '@/components/MmList'
import MmDtl from '@/components/MmDtl'
import MmCrt from '@/components/MmCrt'
import MmSrch from '@/components/MmSrch'
import ScheTdy from '@/components/ScheTdy'
import ScheCrt from '@/components/ScheCrt'
import ScheMth from '@/components/ScheMth'
import ScheList from '@/components/ScheList'
import ScheDtl from '@/components/ScheDtl'
import RankSrch from '@/components/RankSrch'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    // { path: '*', redirect: '/' },
    /* 메인화면  */ { path: '/', name: 'Main', redirect: '/star/srch/view' },
    /* 연예인찾기 */ { path: '/star/srch/view', name: 'StarSrch', component: StarSrch },
    /* 로그인 */ { path: '/login/view', name: 'Login', component: Login },
    /* 가입화면 */ { path: '/signup/view', name: 'Signup', component: Signup },
    /* 가입완료화면 */ { path: '/signup/done/view', name: 'SignupDone', component: SignupDone },
    /* 상세검색 */ { path: '/star/srch/dtl/view', name: 'StarSrchDtl', component: StarSrchDtl },
    /* 검색결과리스트 */ { path: '/star/srch/rst/list/view', name: 'StarSrchRstList', component: StarSrchRstList },
    /* 검색결과상세 */ { path: '/star/srch/rst/dtl/view/:no', name: 'StarSrchRstDtl', component: StarSrchRstDtl },
    /* 검색결과상세 */ { path: '/star/srch/rst/view', name: 'StarSrchRst', component: StarSrchRst },
    /* 연예인등록하기 */ { path: '/star/crt/view', name: 'StarCrt', component: StarCrt },
    /* 기획사정보상세 */ { path: '/cmpy/view/:no', name: 'Cmpy', component: Cmpy },
    /*  */ { path: '/post/list/view', name: 'PostList', component: PostList },
    /*  */ { path: '/post/list/view/:no', name: 'PostListNo', component: PostListNo },
    /*  */ { path: '/post/dtl/view/:no1/:no2', name: 'PostDtlNo', component: PostDtlNo },
    /*  */ { path: '/post/write/view/:no', name: 'PostWrtNo', component: PostWrtNo },
    /*  */ { path: '/my/info/view', name: 'MyInfo', component: MyInfo },
    /*  */ { path: '/my/like/post/view', name: 'MyLikePost', component: MyLikePost },
    /*  */ { path: '/my/like/star/view', name: 'MyLikeStar', component: MyLikeStar },
    /*  */ { path: '/my/post/list/view', name: 'MyPostList', component: MyPostList },
    /*  */ { path: '/my/mfy/view', name: 'MyMfy', component: MyMfy },
    /*  */ { path: '/mm/list/view', name: 'MmList', component: MmList },
    /*  */ { path: '/mm/dtl/view/:no', name: 'MmDtl', component: MmDtl },
    /*  */ { path: '/mm/crt/view/', name: 'MmCrt', component: MmCrt },
    /*  */ { path: '/mm/srch/view', name: 'MmSrch', component: MmSrch },
    /*  */ { path: '/sche/tdy/view', name: 'ScheTdy', component: ScheTdy },
    /*  */ { path: '/sche/crt/view', name: 'ScheCrt', component: ScheCrt },
    /*  */ { path: '/sche/mth/view', name: 'ScheMth', component: ScheMth },
    /*  */ { path: '/sche/list/view', name: 'ScheList', component: ScheList },
    /*  */ { path: '/sche/dtl/view', name: 'ScheDtl', component: ScheDtl },
    /*  */ { path: '/rank/srch/view', name: 'RankSrch', component: RankSrch }
  ]
})
