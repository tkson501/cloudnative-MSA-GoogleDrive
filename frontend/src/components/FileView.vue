<template>

    <v-data-table
        :headers="headers"
        :items="file"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'FileView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            file : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/files'))

            temp.data._embedded.files.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.file = temp.data._embedded.files;
        },
        methods: {
        }
    }
</script>

