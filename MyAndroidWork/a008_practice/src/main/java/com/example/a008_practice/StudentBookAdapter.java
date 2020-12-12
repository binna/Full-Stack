package com.example.a008_practice;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

// Adapter 객체 정의
// 데이터를 받아서 각 item 별로 View 생성
public class StudentBookAdapter extends RecyclerView.Adapter<StudentBookAdapter.ViewHolder> {

    List<StudentBook> items = new ArrayList<StudentBook>();

    static StudentBookAdapter adapter;

    // Adapter 생성자
    public StudentBookAdapter() {this.adapter = this;}



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inf = LayoutInflater.from(parent.getContext());
        View itemView = inf.inflate(R.layout.studnet_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        StudentBook item = items.get(position); // List<> 의 get()
        holder.setItem(item);

    }

    @Override
    public int getItemCount() {
            return items.size();
        }




    // nested class (static inner) 로 ViewHolder 클래스 정의
        static class ViewHolder extends RecyclerView.ViewHolder {

            // ViewHolder 에 담긴 각각의 View 들을 담을 변수
            TextView tvName, tvAge, tvAddress;
            ImageButton btnDelItem;
            ImageView nameTitle, ageTitle, addressTitle;

        // 생성자 필수
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // View 객체 가져오기
            nameTitle = itemView.findViewById(R.id.nameTitle);
            ageTitle = itemView.findViewById(R.id.ageTitle);
            addressTitle = itemView.findViewById(R.id.addressTitle);

            tvName = itemView.findViewById(R.id.tvName);
            tvAge = itemView.findViewById(R.id.tvAge);
            tvAddress = itemView.findViewById(R.id.tvAddress);

            btnDelItem = itemView.findViewById(R.id.btnDelItem);

            // 삭제버튼 누르면 item 삭제되게 하기
            btnDelItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    adapter.removeItem(getAdapterPosition());  // 데이터 삭제
                    // 데이터 변경 (수정, 삭제, 추가) 내역이 adapter 에 반영되어야 정상적으로 동작함!!! ★★★
                    adapter.notifyDataSetChanged();
                }
            });

        } // end 생성자

        // StudentBook 데이터 받아서 멤버 변수 세팅
        @SuppressLint("ResourceType")
        public void setItem(StudentBook item) {
            tvName.setText(item.getName());
            tvAge.setText(item.getAge());
            tvAddress.setText(item.getAddress());
        }

    } // end ViewHolder


    // 데이터를 다루기 위한 메소드들
    // ArrayList 의 메소드들 사용
    public void addItem(StudentBook item) {
        items.add(item);
    }

    public void addItem(int position, StudentBook item) {items.add(position, item);}
    public void setItems(ArrayList<StudentBook> item) {this.items = item;}
    public StudentBook getItem(int position) {return items.get(position);}
    public void setItem(int position, StudentBook item) {items.set(position, item);}
    public void removeItem(int position) {items.remove(position);}


} // end StudentBookAdapter