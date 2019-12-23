/*Copyright (c) 2018 Madona Syombua

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
 */
package com.madonasyombua.growwithgoogleteamproject.data.models

/**
 * Created by jantz on 2/18/2018.
 */
class Portfolio {
    var title: String? = null
    var shortDescription: String? = null
    var longDescription: String? = null
    var portfolioImage = 0

    constructor() {}
    constructor(title: String?, shortDescription: String?, longDescription: String?, portfolioImage: Int) {
        this.title = title
        this.shortDescription = shortDescription
        this.longDescription = longDescription
        this.portfolioImage = portfolioImage
    }

}