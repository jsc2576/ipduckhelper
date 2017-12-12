<template>
	<div>
		<main-nav></main-nav>	
<br>
<div class="content">
	<h2>추천 영상 클립</h2>
	<form>
		<input type="text" name="" placeholder="영상 간편검색" class="search" style="margin-bottom: 30px;">
		<button v-on:click.prevent="searchSimple" class="search_submit click-able"></button>
		<button v-on:click.prevent="goMmSrch" class="click-able">상세검색</button>
		<button v-on:click.prevent="goMmCrt" class="click-able">영상/짤 등록</button>
	</form>
	<div class="star_result" style="width:450px; height: 300px;">
		<a class="click-able" v-on:click.prevent="goMmDtl" ><img src="/img/sample.jpg" style="width: 400px; height:200px;"><br>
		영상정보텍스트
		</a>
	</div>
	<div class="star_result" style="width:450px; height: 300px;">
		<a class="click-able" v-on:click.prevent="goMmDtl" ><img src="/img/sample.jpg" style="width: 400px; height:200px;"><br>
		영상정보텍스트
		</a>
	</div>
	<div class="star_result" style="width:450px; height: 300px;">
		<a class="click-able" v-on:click.prevent="goMmDtl" ><img src="/img/sample.jpg" style="width: 400px; height:200px;"><br>
		영상정보텍스트
		</a>
	</div>
	<div class="star_result" style="width:450px; height: 300px;">
		<a class="click-able" v-on:click.prevent="goMmDtl" ><img src="/img/sample.jpg" style="width: 400px; height:200px;"><br>
		영상정보텍스트
		</a>
	</div>
	<div class="star_result" style="width:450px; height: 300px;">
		<a class="click-able" v-on:click.prevent="goMmDtl" ><img src="/img/sample.jpg" style="width: 400px; height:200px;"><br>
		영상정보텍스트
		</a>
	</div>
	<div class="star_result" style="width:450px; height: 300px;">
		<a class="click-able" v-on:click.prevent="goMmDtl" ><img src="/img/sample.jpg" style="width: 400px; height:200px;"><br>
		영상정보텍스트
		</a>
	</div>
</div>
</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'mm-list',
  components: { MainNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    searchSimple: function () {
      alert('영상 간편 검색')
    },
    goMmDtl: function () {
      this.$router.push({ name: 'MmDtl', params: { no: 1 } })
    },
    goMmSrch: function () {
      this.$router.push({ name: 'MmSrch' })
    },
    goMmCrt: function () {
      this.$router.push({ name: 'MmCrt' })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
