
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import FileManager from "./components/listers/FileCards"
import FileDetail from "./components/listers/FileDetail"

import FileView from "./components/FileView"
import FileViewDetail from "./components/FileViewDetail"
import IndexManager from "./components/listers/IndexCards"
import IndexDetail from "./components/listers/IndexDetail"

import VideoProcessingManager from "./components/listers/VideoProcessingCards"
import VideoProcessingDetail from "./components/listers/VideoProcessingDetail"

import NotificationMgmtManager from "./components/listers/NotificationMgmtCards"
import NotificationMgmtDetail from "./components/listers/NotificationMgmtDetail"


import DashboardView from "./components/DashboardView"
import DashboardViewDetail from "./components/DashboardViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/files',
                name: 'FileManager',
                component: FileManager
            },
            {
                path: '/files/:id',
                name: 'FileDetail',
                component: FileDetail
            },

            {
                path: '/files',
                name: 'FileView',
                component: FileView
            },
            {
                path: '/files/:id',
                name: 'FileViewDetail',
                component: FileViewDetail
            },
            {
                path: '/indices',
                name: 'IndexManager',
                component: IndexManager
            },
            {
                path: '/indices/:id',
                name: 'IndexDetail',
                component: IndexDetail
            },

            {
                path: '/videoProcessings',
                name: 'VideoProcessingManager',
                component: VideoProcessingManager
            },
            {
                path: '/videoProcessings/:id',
                name: 'VideoProcessingDetail',
                component: VideoProcessingDetail
            },

            {
                path: '/notificationMgmts',
                name: 'NotificationMgmtManager',
                component: NotificationMgmtManager
            },
            {
                path: '/notificationMgmts/:id',
                name: 'NotificationMgmtDetail',
                component: NotificationMgmtDetail
            },


            {
                path: '/dashboards',
                name: 'DashboardView',
                component: DashboardView
            },
            {
                path: '/dashboards/:id',
                name: 'DashboardViewDetail',
                component: DashboardViewDetail
            },


    ]
})
