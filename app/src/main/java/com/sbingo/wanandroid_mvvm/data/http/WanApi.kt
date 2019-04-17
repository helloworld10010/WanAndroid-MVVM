package com.sbingo.wanandroid_mvvm.data.http

import com.sbingo.wanandroid_mvvm.model.ArticlePages
import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable

/**
 * Author: Sbingo666
 * Date:   2019/4/3
 */
interface WanApi {

    @GET("article/list/{pageNo}/json")
    fun getArticles(@Path("pageNo") pageNo: Int): Observable<HttpResponse<ArticlePages>>

}