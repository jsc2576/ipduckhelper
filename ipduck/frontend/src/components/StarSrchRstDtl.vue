<template>
	<div>
		<main-nav></main-nav>	
<br>
<div class="search_result" style="padding:40px;">
	연예인 상세정보<br>
	<div class="star_result" style="width:300px; height: 300px;">
		<img src="/img/profile_none.png" style="width: 200px; height:200px;"><br>
		<img src="/img/heart.png" style="float:left; width:30px; height: 30px"> &nbsp;
		<button v-on:click.prevent="doLike" class="click-able" style="font-size:20px; width:130px; height:40px;">좋아요!</button>
	</div>
	<div class="content">
		이름: OO &nbsp; 소속 그룹: OO &nbsp; 소속 기획사: <a class="click-able" v-on:click.prevent="goCmpy">OOOOOOOOOOOO</a><br><br>
		나이: OO &nbsp; 키: OO &nbsp; 생년월일: OOOOOOOOOOOOO<br><br>
		혈액형: OO &nbsp; 몸무게: OOkg<br><br>
		태그 : OO, OO, OO, OO
	</div>
	<div style="clear: both; margin-top: 200px;">
		<button class="click-able" v-on:click.prevent="goStarMfy">정보 수정하기</button>
		<button class="click-able" v-on:click.prevent="goPostListNo">갤러리 들어가기</button>
	</div>
</div>
</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'star-srch-rst-dtl',
  components: { MainNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    goCmpy: function () {
      this.$router.push({ name: 'Cmpy', params: { no: 1 } })
    },
    goPostListNo: function () {
      this.$router.push({ name: 'PostListNo', params: { no: 1 } })
    },
    goStarMfy: function () {
      alert(' 연예인 정보를 수정합니다. ')
      // this.$router.push({ name: 'StarMfy', params: { no: 1 } })
    },
    doLike: function () {
      alert(' 좋아요를 눌렀습니다. ')
      this.$router.push({ name: 'PostListNo', params: { no: 1 } })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
