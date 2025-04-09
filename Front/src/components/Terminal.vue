<template>
    <div class="terminal">
      <div v-for="line in output" class="line">{{ line }}</div>
      <div class="input-line">
        <span>$</span>
        <input v-model="command" @keyup.enter="execute" autofocus />
      </div>
    </div>
  </template>
  
  <script setup>
  import { ref } from 'vue'
  import { useRouter } from 'vue-router'
  
  const router = useRouter()
  const command = ref('')
  const output = ref(['Bienvenue sur le terminal. Tapez `help` pour commencer.'])
  
  function execute() {
    switch (command.value.trim()) {
      case 'help':
        output.value.push('Commandes disponibles : blog, cv, contact, clear')
        break
      case 'blog':
        router.push('/blog')
        break
      case 'cv':
        router.push('/cv')
        break
      case 'contact':
        router.push('/contact')
        break
      case 'clear':
        output.value.length = 0
        break
      default:
        output.value.push(`Commande inconnue: ${command.value}`)
    }
    command.value = ''
  }
  </script>
  
  <style scoped>
  .terminal {
    background: black;
    color: limegreen;
    padding: 1rem;
    height: 100vh;
    font-family: monospace;
  }
  .input-line {
    display: flex;
    gap: 0.5rem;
  }
  input {
    background: transparent;
    color: inherit;
    border: none;
    outline: none;
  }
  </style>