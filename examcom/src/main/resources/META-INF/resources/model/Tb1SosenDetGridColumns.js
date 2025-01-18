/**
 * 祖先明細グリッド定義
 */

let Tb1SosenDetGridColumns = [];

$(function() {
    Tb1SosenDetGridColumns = [
        Column.cell('SOSEN_ID', Messages['Tb1SosenDetGrid.sosenId'], 80, 'primaryKey numbering', null),
        Column.cell('SOSEN_BN', Messages['Tb1SosenDetGrid.sosenBn'], 80, 'primaryKey numbering', null),
        Column.cell('MEMO', Messages['Tb1SosenDetGrid.memo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb1SosenDetGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.cell('DELETE_F', Messages['Tb1SosenDetGrid.deleteF'], 30, '', null),
        Column.cell('STATUS_KB', Messages['Tb1SosenDetGrid.statusKb'], 30, '', null),
    ];
});
