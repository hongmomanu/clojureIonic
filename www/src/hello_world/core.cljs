(ns hello-world.core
  (:require [clojure.browser.repl :as repl])
  (:use-macros [purnam.core :only [obj arr ! def.n]]
               [gyr.core :only [def.module def.config def.factory
                                def.controller def.service]])
  )





#_(defonce conn
  (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)


(def.module starter.controllers [])



(def.controller starter.controllers.AppCtrl [$scope $ionicModal $timeout]

  (! $scope.loginData  {})


  (-> (.fromTemplateUrl  $ionicModal "templates/login.html" (clj->js {
    :scope $scope
  })) (.then  (fn [modal] (
    ! $scope.modal modal
  ))))





  (! $scope.closeLogin (fn [] ( .hide $scope.modal
  )))

  (! $scope.login (fn [] (.show $scope.modal )

  ))

  (! $scope.doLogin (fn []

    ($timeout (fn [] (.closeLogin $scope)) 1000)

   )))

(def.controller starter.controllers.PlaylistsCtrl [$scope]
  (! $scope.playlists (clj->js [
    { :title "Reggae"  :id 1 }
    { :title  "Chill"  :id 2 }
    { :title  "Dubstep" :id 3 }
    { :title  "Indie"  :id 4 }
    { :title  "Rap" :id 5 }
    { :title  "Cowbell" :id 6 }
  ]))

  (println $scope.playlists)

  )
(def.controller starter.controllers.PlaylistCtrl [$scope $stateParams]


  )





(println "Hello world initssssssss  sssssss!")



(defn foo [a b]
  (* a b)) ;; CHANGED

(defn arr []

  (clj->js [
    { :title "Reggae"  :id 1 }
    { :title  "Chill"  :id 2 }
    { :title  "Dubstep" :id 3 }
    { :title  "Indie"  :id 4 }
    { :title  "Rap" :id 5 }
    { :title  "Cowbell" :id 6 }
  ]) )
