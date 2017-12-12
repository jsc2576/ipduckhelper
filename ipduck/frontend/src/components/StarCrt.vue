<template>
	<div>
		<main-nav></main-nav>
		<br>
		<div class="search_result" style="padding:40px;">
			연예인 등록하기<br>
			<form enctype="multipart/form-data" method="post">
				<div class="star_result">
				    <h2>연예인 사진</h2>
				    <input id="file" v-model="upload_img" class="click-able" type="file" value="사진을 업로드하세요">
				 </div>
				<div class="content">
				
					이름 <input v-model="star_nm" type="text" class="search" style="width:150px"> &nbsp;
					기획사 <select class="search" style="width:200px;min-height:35px;" v-model="cmpy_nm" v-on:click="getCmpyNms">
						  <option disabled value="">기획사</option>
						  <option class="del1" disabled value="">-</option>
						  <option class="del1" disabled value="">-</option>
						  <option class="del1" disabled value="">-</option>
						  <option v-for="cmpy_name in cmpy_nms" v-bind:value="cmpy_name">
						    {{ cmpy_name }}
						  </option>
						</select>
					키 <input v-model="star_mem_hght" type="number" class="search" style="width:80px"><br><br>
					몸무게 <input v-model="star_mem_wght" type="number" class="search" style="width:70px"> &nbsp;
					혈액형 <select class="search" style="width:70px;min-height:35px;" v-model="star_mem_bld">
						<option disabled value="">혈액형</option>
						<option  value="0">A</option>
						<option  value="2">B</option>
						<option  value="1">AB</option>
						<option  value="3">O</option>
					</select>
					그룹/솔로 <select class="search" style="width:130px;min-height:35px;" v-model="grp_idx" v-on:click="getGrpNms">
						  <option value="0" disabled >그룹/솔로</option>
						  <option value="1">만들기</option>
						  <option class="del2" disabled value="">-</option>
						  <option v-for="grp in grp_nms" v-bind:value="grp.grp_idx">
						    {{ grp.star_nm }}
						  </option>
						</select>
				    <div id="grp_nm" style="display : none">
				    <br>
					그룹명 <input v-model="grp_nm" type="text" class="search" style="width:70px"> &nbsp;
					<button class="submit_button click-able" style="width:200px;font-size: 20px;" v-on:click.prevent="crtGrp" >생성</button>
					</div>
						<br><br>
					데뷔날짜 <input v-model="star_dbt_date" type="text" class="search" style="width:250px"> &nbsp;
					생년월일 <input v-model="star_mem_birth" type="text" class="search" style="width:250px"><br><br>
					태그 <input type="text" class="search" style="width:600px"><br><br>
					<button class="submit_button click-able" style="width:200px;font-size: 20px;" v-on:click.prevent="starCreate" >등록하기</button>
				</div>
			</form>
		</div>
	</div>
</template>

<script>
import MainNav from '@/components/MainNav'
import axios from 'axios'
import FormData from 'form-data'
// import fs from 'fs'

export default {
  name: 'star-crt',
  components: { MainNav },
  data () {
    return {
      star_nm: '',
      image: '',
      cmpy_nms: [],
      cmpy_nm: '',
      grp_nm: '',
      grp_nms: [],
      grp_idx: 0,
      star_mem_hght: 0,
      star_mem_wght: 0,
      star_mem_bld: '',
      star_mem_birth: '',
      star_dbt_date: '',
      upload_img: null
      // /img/profile_none.png
    }
  },
  watch: {
    grp_idx: function () {
      if (this.$data.grp_idx === '1') {
        this.$el.querySelector('#grp_nm').style.display = 'inline'
      } else {
        this.$el.querySelector('#grp_nm').style.display = 'none'
      }
    }
  },
  methods: {
    crtGrp: function () {
      // let self = this
      axios.post('/crt/grp/do.admin', {
        cmpy_nm: this.cmpy_nm,
        star_nm: this.grp_nm,
        upload_img: null,
        clb_site: ''
      })
    },
    getGrpNms: function () {
      let self = this
      axios.post('/srch/names/grp/do.go', {})
      .then(function (response) {
        console.log(JSON.stringify(response))
        var grpNms = response.data
        self.grp_nms = []
        let els = self.$el.querySelectorAll('.del2')
        for (var j = 0; j < els.length; j++) {
          els[j].remove()
        }
        for (var i = 0; i < grpNms.length; i++) {
          self.grp_nms.push(grpNms[i])
        }
        console.log(JSON.stringify(self.grp_nms))
      })
      .catch(function (error) {
        console.log(JSON.stringify(error))
      })
    },
    getCmpyNms: function () {
      let self = this
      axios.post('/srch/names/cmpy/do', {})
      .then(function (response) {
        var cmpyNms = response.data
        self.cmpy_nms = []
        let els = self.$el.querySelectorAll('.del1')
        for (var j = 0; j < els.length; j++) {
          els[j].remove()
        }
        for (var i = 0; i < cmpyNms.length; i++) {
          self.cmpy_nms.push(cmpyNms[i])
        }
      })
      .catch(function (error) {
        console.log(JSON.stringify(error))
      })
    },
    starCreate: function () {
      let form = new FormData()
      let self = this
      form.append('star_nm', self.star_nm, { type: 'application/json' })
      form.append('upload_img', document.getElementById('file').files[0], { header: { 'Content-Type': 'multipart/form-data' } })
      form.append('star_dbt_date', self.star_dbt_date, { header: { 'Content-Type': 'application/json' } })
      form.append('cmpy_nm', self.cmpy_nm, { header: { 'Content-Type': 'text/html' } })
      form.append('grp_idx', self.grp_idx, { header: { 'Content-Type': 'text/html' } })
      form.append('star_mem_bld', self.star_mem_bld, { header: { 'Content-Type': 'text/html' } })
      form.append('star_mem_wght', self.star_mem_wght, { header: { 'Content-Type': 'text/html' } })
      form.append('star_mem_hght', self.star_mem_hght, { header: { 'Content-Type': 'text/html' } })
      form.append('star_mem_birth', self.star_mem_birth, { header: { 'Content-Type': 'text/html' } })
      axios.post('/crt/star/do.admin', form)
      .then(function (response) {
        console.log(JSON.stringify(response))
      })
      .catch(function (error) {
        console.log(JSON.stringify(error))
      })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
