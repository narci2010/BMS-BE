package meng.xing.repository;

import meng.xing.entity.Paper;
import meng.xing.entity.Subject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/7/23.
 */
@Repository
@RepositoryRestResource(exported = false) //不是rest风格的资源，不能通过url直接获取。必须从controller访问
public interface PaperRepository extends JpaRepository<Paper,Long> {
    Page<Paper> findAll(Pageable pageable);
    Page<Paper> findBySubject(Subject subject,Pageable pageable);
}
