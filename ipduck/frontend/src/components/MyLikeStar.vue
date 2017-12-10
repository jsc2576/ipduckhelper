<template>
	<div>
		<my-nav></my-nav>	
<br>
<div class="search_result" style="padding:40px;">
	선호 연예인<br>
	<div class="star_result" style="width:600px; height: 350px; display: inline-flex;">
		<img v-on:click.prevent="goStarSrchRstDtl" src="/img/profile_none.png" style="width: 200px; height:200px; margin-top: 30px;"><br>
		<div class="content" style="width:300px; height: 300px;">
			연예인이름(그룹명)<br><br>
			<button class="wide" v-on:click.prevent="goStarPost">갤러리 바로가기</button>
			<button class="wide" v-on:click.prevent="goMmList">영상/짤 바로가기</button>
			<button class="wide" v-on:click.prevent="goScheList">스케쥴 바로가기</button>
			<button class="wide" v-on:click.prevent="cancelLike">좋아요 취소하기</button>
		</div>
	</div>
	<div class="star_result" style="width:600px; height: 350px; display: inline-flex;">
		<img v-on:click.prevent="goStarSrchRstDtl" src="/img/profile_none.png" style="width: 200px; height:200px; margin-top: 30px;"><br>
		<div class="content" style="width:300px; height: 300px;">
			연예인이름(그룹명)<br><br>
			<button class="wide" v-on:click.prevent="goStarPost">갤러리 바로가기</button>
			<button class="wide" v-on:click.prevent="goMmList">영상/짤 바로가기</button>
			<button class="wide" v-on:click.prevent="goScheList">스케쥴 바로가기</button>
			<button class="wide" v-on:click.prevent="cancelLike">좋아요 취소하기</button>
		</div>
	</div>
	<div class="star_result" style="width:600px; height: 350px; display: inline-flex;">
		<img v-on:click.prevent="goStarSrchRstDtl" src="/img/profile_none.png" style="width: 200px; height:200px; margin-top: 30px;"><br>
		<div class="content" style="width:300px; height: 300px;">
			연예인이름(그룹명)<br><br>
			<button class="wide" v-on:click.prevent="goStarPost">갤러리 바로가기</button>
			<button class="wide" v-on:click.prevent="goMmList">영상/짤 바로가기</button>
			<button class="wide" v-on:click.prevent="goScheList">스케쥴 바로가기</button>
			<button class="wide" v-on:click.prevent="cancelLike">좋아요 취소하기</button>
		</div>
	</div>
	<div class="star_result" style="width:600px; height: 350px; display: inline-flex;">
		<img v-on:click.prevent="goStarSrchRstDtl" src="/img/profile_none.png" style="width: 200px; height:200px; margin-top: 30px;"><br>
		<div class="content" style="width:300px; height: 300px;">
			연예인이름(그룹명)<br><br>
			<button class="wide" v-on:click.prevent="goStarPost">갤러리 바로가기</button>
			<button class="wide" v-on:click.prevent="goMmList">영상/짤 바로가기</button>
			<button class="wide" v-on:click.prevent="goScheList">스케쥴 바로가기</button>
			<button class="wide" v-on:click.prevent="cancelLike">좋아요 취소하기</button>
		</div>
	</div>		
</div>
</template>

<script>
import MyNav from '@/components/MyNav'

export default {
  name: 'my-like-post',
  components: { MyNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    goStarSrchRstDtl: function () {
      this.$router.push({ name: 'StarSrchRstDtl', params: { no: 1 } })
    },
    goStarPost: function () {
      this.$router.push({ name: 'PostListNo', params: { no: 1 } })
    },
    goMmList: function () {
      this.$router.push({ name: 'MmList' })
    },
    goScheList: function () {
      alert('go to 스케쥴')
      // this.$router.push({ name: 'PostList' })
    },
    cancelLike: function () {
      alert('좋아요 취소합니다.')
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
