(ns offcourse.styles.components.index
  (:require [offcourse.styles.components
             [business-card :refer [business-card]]
             [button :refer [button]]
             [sheet :refer [sheet]]
             [logo :refer [logo]]
             [image :refer [image]]
             [form :refer [form]]
             [label :refer [label-component]]
             [list :refer [list-component]]
             [content :refer [content]]
             [viewer :refer [viewer]]
             [footer :refer [footer]]
             [header :refer [header]]]))

(defn components [config]
  (let [components [header logo sheet business-card content button image form label-component list-component footer viewer]]
    (for [component components] (component config))))
