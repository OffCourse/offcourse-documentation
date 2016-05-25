(ns offcourse.styles.vocabulary
  (:refer-clojure :exclude [first second last list])
  (:require [garden.selectors :as s]))

;; LAYOUT
(s/defclass container)
(s/defclass container-without)
(s/defclass layout)
(s/defclass layout--section)
(s/defclass main)
(s/defclass main--section)
(s/defclass main--header)

;; HEADER
(s/defclass header)
(s/defclass header--container)
(s/defclass header--section)
(s/defclass header--list)
(s/defclass header--sublist)
(s/defclass header--textbar)
(s/defclass header--textbar-small)
(s/defclass header--textbar-inverse)

; Footer
(s/defclass footer)
(s/defclass footer--container)
(s/defclass footer--icon)


;; ELEMENTS
(s/defclass list)
(def todo-list (list (s/attr :data-list-type := :todo)))
(def edit-list (list (s/attr :data-list-type := :edit)))
(s/defclass list--item)

(s/defclass sheets)
(s/defclass sheet)
(s/defclass sheet--section)
(s/defclass sheet--section--without)

(s/defclass strips)
(s/defclass strip)
(s/defclass strip--section)

(s/defclass cards)
(s/defclass card)
(s/defclass card--section)

(s/defclass cards-person)
(s/defclass card-person)
(s/defclass card-person--image)
(s/defclass button-container)

(s/defclass labels)
(s/defclass label)

(s/defclass logo)

;; this one must disappear
(s/defclass dashboard)

(s/defclass button)
(def textbar-button (button (s/attr :data-button-type := :textbar)))
(def icon-button (button (s/attr :data-button-type := :icon)))
(def checkbox-button (button (s/attr :data-button-type := :checkbox)))

(s/defclass title)
(s/defclass subtitle)
(s/defclass content)
(s/defclass content-emphasis)
(s/defclass emphasis)
(s/defclass emphasis-textbar)

;; MODIFIERS
(s/defpseudoclass hover)
(s/defpseudoclass disabled)
(s/defpseudoclass first-child)
(s/defpseudoclass last-child)

(def selected (s/& (s/attr :data-selected := :true)))
(def disabled (s/& disabled))
(def hovered (s/& hover))
(def first (s/& first-child))
(def last (s/& last-child))
(def second (s/& (s/nth-child 2)))
(def third (s/& (s/nth-child 3)))
