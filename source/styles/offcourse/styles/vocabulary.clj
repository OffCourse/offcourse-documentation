(ns offcourse.styles.vocabulary
  (:refer-clojure :exclude [first second last list])
  (:require [garden.selectors :as s]))

; Layout
(s/defclass layout)
(s/defclass layout--section)
(s/defclass grid)
(s/defclass grid--section)
(s/defclass container)

; Helpers
(s/defclass padding-tb-one)
(s/defclass padding-t-two)
(s/defclass padding-tb-four)

; Typography
(s/defclass title)
(s/defclass subtitle)
(s/defclass text)
(s/defclass content)

; Header
(s/defclass header)
(s/defclass header--column)
(s/defclass header--row)

; Logo
(s/defclass logo)
(s/defclass logo--padded)
(s/defclass logo--inverse)
(s/defclass logo--large)

; Sheet
(s/defclass sheet)

; Form
(s/defclass form--row)
(s/defclass form--input)
(s/defclass form--subscribe)

; Footer
(s/defclass footer)
(s/defclass footer--container)
(s/defclass footer--header)
(s/defclass footer--textbar)

; Components
(s/defclass list)
(def todo-list (list (s/attr :data-list-type := :todo)))
(def edit-list (list (s/attr :data-list-type := :edit)))
(s/defclass list--item)


(s/defclass cards)
(s/defclass card)
(s/defclass card--section)

(s/defclass cards-person)
(s/defclass card-person)
(s/defclass card-person--image)
(s/defclass button-container)

(s/defclass labels)
(s/defclass label)

(s/defclass button)
(def textbar-button (button (s/attr :data-button-type := :textbar)))
(def icon-button (button (s/attr :data-button-type := :icon)))
(def checkbox-button (button (s/attr :data-button-type := :checkbox)))

;; MODIFIERS
(s/defpseudoclass hover)
(s/defpseudoclass disabled)
(s/defpseudoclass first-child)
(s/defpseudoclass last-child)

(def selected (s/& (s/attr :data-selected := :true)))
(def disabled (s/& disabled))
(def hovered (s/& hover))
(def first (s/& first-child))
(def second (s/& (s/nth-child 2)))
(def third (s/& (s/nth-child 3)))
(def last (s/& last-child))
