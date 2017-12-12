<template>
	<div>
		<main-nav></main-nav>
		<br>
		<div class="search_result" style="padding:40px;">
			연예인 등록하기<br>
			<form>
				<!-- <div class="star_result" style="width:300px; height: 300px;">
					<img src="/img/profile_none.png" style="width: 200px; height:200px;"><br>
					<input class="click-able" type="file" value="사진을 업로드하세요">
				</div> -->
				<div class="star_result" v-if="!image">
				    <h2>연예인 사진</h2>
				    <input v-model="upload_img" class="click-able" type="file" value="사진을 업로드하세요" @change="onFileChange">
				 </div>
				 <div class="star_result" v-else>
				    <img style="width: 200px; height:200px;" :src="image" />
				    <button class="click-able" @click="removeImage">Remove image</button>
				 </div>
				<div class="content">
				
					이름 <input v-model="star_nm" type="text" class="search" style="width:150px"> &nbsp;
					기획사 <select class="search" style="width:200px;min-height:35px;" v-model="cmpy_name" v-on:click="getCmpyNms">
						  <option disabled value="">기획사</option>
						  <option class="del1" disabled value="">-</option>
						  <option class="del1" disabled value="">-</option>
						  <option class="del1" disabled value="">-</option>
						  <option v-for="cmpy_nm in cmpy_nms" v-bind:value="cmpy_nm">
						    {{ cmpy_nm }}
						  </option>
						</select>
					키 <input v-model="star_mem_hght" type="text" class="search" style="width:80px"><br><br>
					나이 <input v-model="star_mem_birth" type="text" class="search" style="width:70px"> &nbsp;
					몸무게 <input v-model="star_mem_wght" type="text" class="search" style="width:70px"> &nbsp;
					혈액형 <input v-model="star_mem_bld" type="text" class="search" style="width:70px"> &nbsp;
					그룹/솔로 <select class="search" style="width:70px;min-height:35px;" v-model="grp_idx" v-on:click="getGrpNms">
						  <option value="0">솔로</option>
						  <option class="del2" disabled value="">-</option>
						  <option class="del2" disabled value="">-</option>
						  <option v-for="grp in grp_nms" v-bind:value="grp.idx">
						    {{ grp.nm }}
						  </option>
						</select>
						<br><br>
					데뷔날짜 <input type="text" class="search" style="width:250px"> &nbsp;
					생년월일 <input type="text" class="search" style="width:250px"><br><br>
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

export default {
  name: 'star-crt',
  components: { MainNav },
  data () {
    return {
      msg: '',
      image: '',
      cmpy_nms: [],
      cmpy_name: '',
      grp: [],
      grp_idx: 0
      // /img/profile_none.png
    }
  },
  methods: {
    getGrpNms: function () {
      let self = this
      axios.post('/srch/names/grp/do.go', {})
      .then(function (response) {
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
      // let self = this
      /* axios.post('/crt/star/do.admin', {
      })
      .then(function (response) {
      })
      .catch(function (error) {
      }) */
    },
    onFileChange: function (e) {
      let files = e.target.files || e.dataTransfer.files
      if (!files.length) {
        return
      }
      this.createImage(files[0])
    },
    createImage: function (file) {
      // /crt/star/do.admin
      // let image = new Image()
      let reader = new FileReader()
      let vm = this
      reader.onload = (e) => {
        vm.image = e.target.result
      }
      reader.readAsDataURL(file)
    },
    removeImage: function (e) {
      this.image = ''
      e.preventDefault()
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
