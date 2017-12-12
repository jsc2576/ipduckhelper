<template>
	<div>
		<main-nav></main-nav>	

<br>
<div class="schedule">
	<h2>스케쥴 상세보기</h2><br><br>
	연예인	<span class="sched_content">OOOO</span><br><br>
	스케쥴명	<span class="sched_content">OOOO</span><br><br>
	기간	<span class="sched_content">2017.01.01 ~ 2017.01.01</span><br><br><br>
	<button onclick="location.href='./schedule_add.html'">수정</button>&nbsp;&nbsp;
	<button onclick="location.href='./schedule.html'">삭제</button>
</div>
</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'sche-dtl',
  components: { MainNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    doLike: function () {
      alert('좋아요를 누르셨습니다.')
      // this.$router.push({ name: 'MmMfy' })
    },
    dltMm: function () {
      alert('영상을 삭제하시겠습니까?')
      // this.$router.push({ name: 'MmMfy' })
    },
    addTag: function () {
      alert('태그를 추가하시겠습니까')
      // this.$router.push({ name: 'MmMfy' })
    },
    goMmMfy: function () {
      alert('영상게시물을 편집하시겠습니까')
      // this.$router.push({ name: 'MmMfy' })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
