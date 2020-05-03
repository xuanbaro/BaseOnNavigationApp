# BaseOnNavigationApp
基于Navigation框架搭建的app，

项目程序：
1：基于TabLayout和ViewPager实现视频播放器和图片手势

实现步骤：
添加TabLayout和ViewPager，
添加RecyclerView显示视频和图片的缩略图，
设置RecyclerView适配器，适配器添加监听接口，
通过在Fragment中设置监听，
点击视频缩略图，startActivity进入一个新的Activity播放视频
点击图片缩略图，startActivity进入一个新的Activity进行图片手势


2：基于Echarts绘制的可视化图html文件交互安卓webView显示

实现步骤：
添加assets文件，放入要绘制好可视化图形的html文件
在Fragment中加载html路径，传入x轴和y轴参数


3:基于高德地图实现地图显示
实现步骤：
在高德官网申请key，下载地图
Libs中复制地图并右键Add as Library，
manifest中添加mata-data，并填写key
写入xml和java文件
