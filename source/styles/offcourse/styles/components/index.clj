(ns offcourse.styles.components.index
  (:require [offcourse.styles.components
             [card :refer [card]]
             [button :refer [button]]
             [logo :refer [logo]]
             [image :refer [image]]
             [form :refer [form]]
             [label :refer [label-component]]
             [list :refer [list-component]]
             [content :refer [content]]
             [footer :refer [footer]]
             [header :refer [header]]]))

(defn components [config]
  (let [components [content button logo image form label-component list-component header card footer]]
    (for [component components] (component config))))
