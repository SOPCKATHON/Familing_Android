package com.sopt.familing.util

data class PostData(
        val category : Int,
        val title : String,
        val contents : String,
        val date : String,
)


/** 카테고리 Idx 0 ~ 4
 * 외식, 가벼운 외출, 여행, 운동, 기타
 *
 * date
 * '2021-11-20'
 * */