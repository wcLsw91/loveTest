<template>
  <div>
    <div>
      <b-navbar toggleable="lg" type="dark" variant="primary">
        <b-navbar-brand>
          <NuxtLink to="/">
            <div class="contentBox" style="display: flex; align-items: center">
              <img src="~/assets/심쿵.png" alt="Kitten">
              <div>&nbsp;연구소</div>
            </div>
          </NuxtLink>
        </b-navbar-brand>

        <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

        <b-collapse id="nav-collapse" is-nav>
          <b-navbar-nav>
            <div>&nbsp;&nbsp;</div>
            <NuxtLink to="/test/create">테스트 등록</NuxtLink>
          </b-navbar-nav>

          <!-- Right aligned nav items -->
          <b-navbar-nav class="ml-auto">
            <b-nav-form>
              <b-form-input size="sm" class="mr-sm-2" placeholder="Search"></b-form-input>
              <b-button size="sm" class="my-2 my-sm-0" type="submit">Search</b-button>
            </b-nav-form>

<!--            <b-nav-item-dropdown text="Lang" right>-->
<!--              <b-dropdown-item href="#">EN</b-dropdown-item>-->
<!--              <b-dropdown-item href="#">ES</b-dropdown-item>-->
<!--              <b-dropdown-item href="#">RU</b-dropdown-item>-->
<!--              <b-dropdown-item href="#">FA</b-dropdown-item>-->
<!--            </b-nav-item-dropdown>-->

            <b-nav-item-dropdown right>
              <!-- Using 'button-content' slot -->
              <template #button-content>
                <em>User</em>
              </template>
              <b-dropdown-item href="#">Profile</b-dropdown-item>
              <b-dropdown-item href="#">Sign Out</b-dropdown-item>
            </b-nav-item-dropdown>
          </b-navbar-nav>
        </b-collapse>
      </b-navbar>
    </div>
    <main>
      <div class="wrapper">
        <div class="logo"></div>
        <Nuxt />
      </div>
    </main>
  </div>
</template>

<style>
:root {
  --primary-color: #00c58e;
  --wrapper-width-min: 350px;
  --wrapper-width-max: 625px;
}

body {
  font-family: system-ui, -apple-system, BlinkMacSystemFont, Segoe UI, Roboto,
  Helvetica Neue, Arial, Noto Sans, sans-serif, Apple Color Emoji,
  Segoe UI Emoji, Segoe UI Symbol, Noto Color Emoji;
  margin: 0;
}

.navbar-nav{
  color:#fff;
}

a {
  color: inherit;
  text-decoration: none;
}
nav a:hover {
  text-decoration: none;
}

a:hover {
  text-decoration: underline;
}

.contentBox:before{
  content:'';
  display: inline-block;
  vertical-align: middle;
  height: 100%;
}

header{
  margin: 0 auto;
  margin-top: 5px;
  padding: 0 1rem;
  max-width: 1280px;
  text-align: center;
}

main {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin: 0 auto;
  margin-top: 30px;
  padding: 0 1rem;
  max-width: 1280px;
  text-align: center;
}

.wrapper{
  min-width: var(--wrapper-width-min);
  max-width: var(--wrapper-width-max);
  display: flex;
  flex-direction: column;
  align-items: center;
}

main img{
  width: 80px;
  height: 120px;
  /*object-fit: cover;*/
}


.logo {
  margin-left: auto;
  margin-right: auto;
  margin-bottom: 1rem;
  width: 100%;
  height: 120px;
  /*outline: 2px solid red;*/
  background-repeat: repeat-x;
  background-image: url("~/assets/potion.png");
  background-size : 90px 120px;
}


ul {
  list-style-type: none;
  padding: 0;
}

.mainList{
  display: flex;
  flex-direction: row;
  flex-wrap: wrap;
  justify-content: center;
}

li {
  margin: 0 0.5rem;
  padding: 0.25rem;
  font-size: 1.2rem;
}

nav {
  padding: 0 1rem;
}
</style>
