/**
 * 祖先グリッド定義
 */

let TSosenGridColumns = [
    Column.comma('SOSEN_ID', Messages['TSosenGrid.sosenId'], 150, 'primaryKey numbering', null),
    Column.text('SOSEN_MEI', Messages['TSosenGrid.sosenMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TSosenGrid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TSosenGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TSosenGrid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TSosenGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TSosenGrid.deleteF'], 30, ''),
];
