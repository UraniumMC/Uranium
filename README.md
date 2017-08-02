**[加入KCauldronX交流群!](https://jq.qq.com/?_wv=1027&k=4BEK1SI)**
# KCauldronX
### KCauldronX - continuation of KCauldron minecraft server
[![Build Status][build_status]](https://ci.xjboss.net/job/KCauldronX/) [![Download KCauldronX][download_img]][download_url] 

[![bStats][bStats]][bStats_link] [![yumc Stats][yumc_Stats]][yumc_Stats_link]

![donate][donate_img] 1PFBV7gFBEqG1hcYhR9CvrvQhENczsRgHg
## Building KCauldronX
* Ensure you are using Java JDK 8u101 or higher.
* Checkout project
  * You can use IDE or clone from console:
  `git clone https://git.xjboss.net/KC-RELOADED/KCauldronX.git`
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
* If you're using beta-release of KCauldronX - check on latest stable
  * All versions situated [there](https://ci.xjboss.net/job/KCauldronX/)
* If bug still present - KCauldronX issue
  * Make sure that similar issue not exists already
  * Please fill [issue form](https://git.xjboss.net/KC-RELOADED/KCauldronX/issues/new) else

[donate_img]: https://git.xjboss.net/static/donate-Bitcoin.svg
[download_url]: https://pan.baidu.com/s/1i4DHUHR#list/path=/KCauldronX/%23lastSuccessfulBuild
[download_img]: https://git.xjboss.net/static/download-latest.svg
[build_status]: https://ci.xjboss.net/job/KCauldronX/badge/icon
[bStats]: https://git.xjboss.net/static/bStats-KCX.svg
[bStats_link]: https://bstats.org/plugin/bukkit/KCauldronX
[yumc_Stats]: https://git.xjboss.net/static/yumc-KCX.svg
[yumc_Stats_link]: http://www.yumc.pw/Home/Statistics/Plugin.html?name=KCauldronX