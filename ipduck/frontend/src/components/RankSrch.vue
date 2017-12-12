<template>
	<div>
		<main-nav></main-nav>	

<br>
	<div id="star_likes" style="margin: auto; width: 900px; height: 500px; z-index: 1"></div>
   	<div id="star_tags" style="margin: auto; width: 900px; height: 500px; z-index: 1"></div>
</div>
</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'rank-srch',
  props: ['no1', 'no2'],
  components: { MainNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    goPostMfy: function () {
      alert(' 게시물 수정페이지로 이동합니다 ')
      // this.$router.push({ name: 'PostMfy' })
    },
    dltPost: function () {
      alert(' 게시물 삭제하시겠습니까 ')
      // this.$router.push({ name: 'dltPost' })
    },
    mfyCmt: function () {
      alert(' 댓글 수정하시겠습니까 ')
      // this.$router.push({ name: '' })
    },
    dltCmt: function () {
      alert(' 댓글 삭제하시겠습니까 ')
      // this.$router.push({ name: '' })
    },
    crtCmt: function () {
      alert(' 댓글 등록하시겠습니까 ')
      // this.$router.push({ name: '' })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
