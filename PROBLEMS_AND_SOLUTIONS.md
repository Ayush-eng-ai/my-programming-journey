# Problems and Solutions Journal

This file documents real development problems, debugging experiences, Git/GitHub issues, coding mistakes, and the solutions I learned during my software engineering and data science journey.

---

# Problem 1 — GitHub Contributions Not Showing

## Problem

Even after pushing code daily to GitHub, my contribution graph was not increasing.

Repositories were updating successfully, but the green contribution squares were missing.

---

## Cause

The local Git configuration was connected to the wrong email identity.

Example:

```bash
git config user.email
```

Output:

```bash
studentdev@college.edu
```

But my actual GitHub account used:

```bash
developer@gmail.com
```

Because of this mismatch, GitHub could not properly link my commits to my main profile.

---

## Additional Problems Faced

* Push rejection error
* Merge conflicts
* Rebase confusion
* Wrong commit identity
* GitHub account mismatch

---

## Errors

### Push Rejected

```bash
! [rejected] main -> main (fetch first)
```

### Merge Conflict

```bash
CONFLICT (add/add): Merge conflict
```

---

## Solution

### Step 1 — Check Git Identity

```bash
git config --global user.email
git config --global user.name
```

### Step 2 — Update Correct Identity

```bash
git config --global user.email "developer@gmail.com"
git config --global user.name "Student Developer"
```

### Step 3 — Pull Latest Changes

```bash
git pull origin main --rebase
```

### Step 4 — Resolve Conflicts and Push

```bash
git add .
git rebase --continue
git push origin main
```

---

## What I Learned

* GitHub contributions depend on commit email identity
* Git conflicts are normal
* Rebase workflow is important
* Debugging is part of development
* Real learning happens while solving practical problems

---

More problems and solutions will be added as I continue learning software development, data science, AI, and machine learning.
