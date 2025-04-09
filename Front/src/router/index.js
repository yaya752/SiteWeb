import { createRouter, createWebHistory } from 'vue-router'
import Terminal from '../components/Terminal.vue'
import CV from '../components/CV.vue'
import Blog from '../components/Blog.vue'
import Contact from '../components/Contact.vue'
import Admin from '../components/Admin.vue'

const routes = [
  { path: '/', component: Terminal },
  { path: '/cv', component: CV },
  { path: '/blog', component: Blog },
  { path: '/contact', component: Contact },
  { path: '/admin', component: Admin },
]

export default createRouter({
  history: createWebHistory(),
  routes
})