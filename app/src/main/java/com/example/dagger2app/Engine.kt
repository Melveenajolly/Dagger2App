package com.example.dagger2app

import javax.inject.Inject

class Engine @Inject constructor(){ /** Injecting constructor because it also in DAG graph */
}