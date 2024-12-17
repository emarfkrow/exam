/**
 * 主キーなしグリッド定義
 */

let Tb2NoPkGridColumns = [
    Column.text('COLUMN_A', Messages['Tb2NoPkGrid.columnA'], 300, '', null),
    Column.text('COLUMN_B', Messages['Tb2NoPkGrid.columnB'], 300, '', null),
    Column.text('COLUMN_C', Messages['Tb2NoPkGrid.columnC'], 300, '', null),
    Column.text('COLUMN_D', Messages['Tb2NoPkGrid.columnD'], 300, '', null),
    Column.text('COLUMN_E', Messages['Tb2NoPkGrid.columnE'], 300, '', null),
    Column.cell('INSERT_DT', Messages['Tb2NoPkGrid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['Tb2NoPkGrid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['Tb2NoPkGrid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['Tb2NoPkGrid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb2NoPkGrid.deleteF'], 30, ''),
];
