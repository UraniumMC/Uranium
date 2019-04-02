**[加入Uranium官方钦定交流群!](https://jq.qq.com/?_wv=1027&k=4BEK1SI)**

**[Join UraniumMC offical discord chat room](https://discord.gg/dCjehb3)**
# Uranium
### Uranium - continuation of KCauldron minecraft server
![GitHub stars](https://img.shields.io/github/stars/UraniumMC/Uranium.svg?style=social)

[![build_status]](https://ci.uraniummc.cc/job/Uranium-dev/)
 
[![Download Uranium][download_img]][download_url]
 
[![bStats][bStats]][bStats_link] [![yumc Stats][yumc_Stats]][yumc_Stats_link]

## Building Uranium
* Ensure you are using Java JDK 8u101 or higher.
* Checkout project
  * You can use IDE or clone from console:
  `git clone https://git.aimc.vip/UraniumDev/Uranium.git`
* Init submodules
  * Since this project is merger of two other we need both.
  `git submodule update --init --recursive`
* Setup initial workspace
  * This process download minecraft and apply patches
  * If you have gradle integration in IDE - you can still use gui
  `./gradlew setupCauldron`
* Build both legacy server jar & default jar
  `./gradlew jar`

## Updating sources
If you're once checkout source - you not need to do it again
* Update sources
  * `git pull origin master`
* Reapply patches & build binaries
  * `./gradlew clean setupCauldron jar`


## Issue submitting rule
* First check the bug in single player and vanilla forge, if bug still present - mod issue
* Check with minimal server environment
  * Remove all unnecessary plugins and mods
  * Reset all configs to default
  If bug present - mod compatibility issue
* If you're using beta-release of Uranium - check on latest stable
  * All versions situated [there](https://ci.uraniummc.cc/job/Uranium-Dev)
* If bug still present - Uranium issue
  * Make sure that similar issue not exists already
  * Please fill [![issue form][GitHub issues]](https://github.com/UraniumMC/Uranium/issues/new) else

[download_url]: https://pan.baidu.com/s/1jI42BHG#list/path=/Uranium-dev/%23lastSuccessfulBuild
[download_img]: https://img.shields.io/badge/download-BaiduCloud-blue.svg
[build_status]: https://ci.uraniummc.cc/job/Uranium-dev/badge/icon
[bStats]: https://img.shields.io/bstats/players/1372.svg?label=bstats%20players
[bStats_link]: https://bstats.org/plugin/bukkit/Uranium
[yumc_Stats]: https://img.shields.io/badge/yumc-Uranium-blue.svg
[yumc_Stats_link]: http://www.yumc.pw/Home/Statistics/Plugin.html?name=Uranium
[GitHub issues]: https://img.shields.io/github/issues/UraniumMC/Uranium.svg