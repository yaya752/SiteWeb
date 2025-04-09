<template>
    <h1>{{ props.title }}</h1>
    <p> {{ props.name }} </p>

</template>

<script setup>
    const props = defineProps({
        title: {
            type: String,
            required: true
        },
        name: {
            type: String,
            required: true
        }
    })
</script>