<template>
<ul class="navbar">
	<li class="left"><a v-on:click.prevent="goMain">마이페이지</a></li>	
	<li class="right"><a v-on:click.prevent="goMyLikeStar">나의 연예인</a></li>	
	<li class="right"><a v-on:click.prevent="goMyLikePost">좋아요 한 글</a></li>	
	<li class="right"><a v-on:click.prevent="goMyPostList">게시글/댓글</a</a></li>	
	<li class="right"><a v-on:click.prevent="goMyInfo">프로필 설정</a></li>	
</ul>
</template>

<script>

export default {
  name: 'my-nav',
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    goMain: function () {
      this.$router.push({ name: 'Main' })
    },
    goMyInfo: function () {
      this.$router.push({ name: 'MyInfo' })
    },
    goMyPostList: function () {
      this.$router.push({ name: 'MyPostList' })
    },
    goMyLikeStar: function () {
      this.$router.push({ name: 'MyLikeStar' })
    },
    goMyLikePost: function () {
      this.$router.push({ name: 'MyLikePost' })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
